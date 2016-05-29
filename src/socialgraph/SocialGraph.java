/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialgraph;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro
 */
public class SocialGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rede rede = new Rede();
        try {
            //Leitura de pessoas
            for (String line : Files.readAllLines(Paths.get("dados/pessoas.txt"))) {
                rede.adicionarPessoa(new Pessoa(line));
            }
            //Leitura de amizades
            for (String line : Files.readAllLines(Paths.get("dados/amizades.txt"))) {
                String[] amigos = line.split(" ");

                ArrayList<Pessoa> lista = rede.getListaDePessoas();

                Pessoa p1 = rede.findPessoa(amigos[0]);
                Pessoa p2 = rede.findPessoa(amigos[1]);

                p1.adicionarAmigo(p2);
                p2.adicionarAmigo(p1);

                for (Pessoa p : lista) {
                    if (p.getNome().equals(p1.getNome())) {
                        p = p1;
                    } else if (p.getNome().equals(p1.getNome())) {
                        p = p2;
                    }
                }

                rede.setListaDePessoas(lista);

            }
            //Leitura de posts
            for (String line : Files.readAllLines(Paths.get("dados/posts.txt"), Charset.forName("ISO_8859_1"))) {
                String[] postStr = line.split(" ");
                ArrayList<Pessoa> lista = rede.getListaDePessoas();

                Pessoa p1 = rede.findPessoa(postStr[0]);//Acha a pessoa
                if (p1 != null) {
                    String[] keys = postStr[1].split("/");//Pega as chaves dos posts
                    Post post = new Post();
                    for (String key : keys) {
                        post.adicionarKey(key);
                    }
                    p1.adicionarPost(post);//Adiciona post à pessoa

                    for (Pessoa p : lista) {
                        if (p.getNome().equals(p1.getNome())) {
                            p = p1;
                        }
                    }
                    
                    rede.setListaDePessoas(lista);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(SocialGraph.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Pessoa p : rede.getListaDePessoas()) {
            for (Pessoa amigo : p.getListaDeAmigos()) {
                //System.out.println(p.getNome() + " é amigo de " + amigo.getNome());
            }
        }

        SocialGraph g = new SocialGraph();

        g.buscaFeedNoticias(rede.findPessoa("Geniel"));
    }

    public void buscaFeedNoticias(Pessoa origem) {
        Stack<Pessoa> pilha = new Stack<>();

        pilha.push(origem);
        origem.visitado = true;

        while (!pilha.isEmpty()) {
            Pessoa v = pilha.pop();
            //System.out.println(pilha);

            System.out.println("Inicio amigos de "+v.getNome());
            for (int i = 0; i < v.getListaDeAmigos().size(); i++) {
                Pessoa adj = v.getListaDeAmigos().get(i);
                System.out.println("Post de "+adj.getNome());
                for(Post p : adj.getPosts()){
                    for(String str : p.getKeyList()){
                        System.out.println(str);
                    }
                }
                if (adj.visitado == false) {
                    //System.out.println(v.getNome() + " >> " + adj.getNome());
                    pilha.push(adj);
                    adj.visitado = true;
                }
            }
            System.out.println("Fim amigos de "+v.getNome());
        }
    }

}
