
import dao.Impl.PostDAOImpl;
import entity.Post;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Five Swag
 */
public class test {

    public static void main(String[] args) throws Exception {
//        PostDAOImpl pdb = new PostDAOImpl();
//        Post p = pdb.getLatestPost();
//        System.out.println(p.getContent());
    }

    class Information {

        private String description;
        private String address;
        private String phone;
        private String email;
        private String openHours;
    }

    class Menu {

        private int id;
        private String name;
        private String content;
        private String description;
        private float price;
    }

    class Post {

        private int id;
        private String title;
        private String content;
        private String description;
        private String image;
    }

    class PageView {

        private String name;
        private int value;
    }
}
