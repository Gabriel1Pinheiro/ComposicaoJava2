package application;
import Entities.Comment;
import Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Tenha uma boa viagem!");
        Comment c2 = new Comment("Uau, isso é incrível!");
        Post p1 = new Post(sdf.parse("21/06/2023 16:00:59"),
                "Viajando para a Nova Zelândia",
                "Finalmente vou visitar esse pais maravilhoso ",
                50);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

    }
}
