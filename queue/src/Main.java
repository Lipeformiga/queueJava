import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Queue<String> engenharia = new LinkedList<>();
        Queue<String> marketing = new LinkedList<>();
        Queue<String> q = new LinkedList<>();

        String luis = "Luis";
        String pedro = "Pedro";
        String luisa = "Luisa";
        String joao = "João";
        String jose = "Jose";
        String miguel = "Miguel";

        q.add(luis);
        q.add(pedro);
        q.add(luisa);
        q.add(joao);
        q.add(jose);
        q.add(miguel);

        process(engenharia, marketing, q, 'b', luis);
        process(engenharia, marketing, q, 'a', pedro);
        process(engenharia, marketing, q, 'a', luisa);
        process(engenharia, marketing, q, 'x', joao);
        process(engenharia, marketing, q, 'x', jose);
        process(engenharia, marketing, q, 'b', miguel);


        System.out.println("fila a(engenharia):"+ engenharia);
        System.out.println("fila b(marketing):"+ marketing);
        System.out.println("fila q:"+ q);

    }

    public static void process(Queue<String> a, Queue<String> b, Queue<String> q, char escolha, String pessoa) {

        switch(escolha){

            case 'a':
                a.add(pessoa);
                q.remove(pessoa);
                break;
            case 'b':
                b.add(pessoa);
                q.remove(pessoa);
                break;
            case 'x':
                q.remove(pessoa);
                if (a.size() < b.size()){
                    a.add(pessoa);
                }
                else if (b.size() < a.size()) {
                    b.add(pessoa);
                }
                else {

                }
                break;
        }
    }
}
