package com.soft1851.spring.web.controller;

import com.soft1851.spring.web.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/24
 */
//@Controller
//@RequestMapping("/")
//public class HelloController {
//    @GetMapping("home")
//    public String home(Model model){
//        model.addAttribute("message","Hello Spring MVC");
//        Book[] books = {
//                new Book(1,"钢铁是怎样炼成的","https://img1.doubanio.com/view/subject/s/public/s33523858.jpg",
//                        "[苏联]", "尼古拉·阿列克谢耶维奇·奥斯特洛夫斯基",
//                        "本书的主人公保尔·柯察金饱尝了生活的苦难，炼就了革命精神和反抗性格。十月革命爆发后只有十六岁的他，就参加了红军，无论在战炮火中，还是在国民经济复时期，可察金都表现出大无畏精神，钢铁一般的意志，强烈的爱国主义和对人民的无限的无限忠诚。"),
//                new Book(2,"Effective Java: Second Edition","https://img3.doubanio.com/view/subject/s/public/s3259732.jpg",
//                        "[美]","Joshua Bloch",
//                        "Written for the working Java developer, Joshua Bloch's Effective Java Programming Language Guide provides a truly useful set of over 50 best practices and tips for writing better Java code."),
//                new Book(3,"冰与火之歌（卷一）","https://img9.doubanio.com/view/subject/s/public/s1358984.jpg",
//                        "[美]","乔治·R·R·马丁",
//                        "《冰与火之歌》由美国著名科幻奇幻小说家乔治·R·R·马丁所著，是当代奇幻文学一部影响深远的里程碑式的作品。它于1996年刚一问世，便以别具一格的结构，浩瀚辽阔的视野，错落有致的情节和生动活泼的语言，迅速征服了欧美文坛。迄今，本书已被译为数十种文字，并在各个国家迭获大奖。"),
//                new Book(4,"红楼梦","https://img1.doubanio.com/view/subject/s/public/s1070959.jpg",
//                        "[清]","曹雪芹 著 / 高鹗 续",
//                        "《红楼梦》是一部百科全书式的长篇小说。以宝黛爱情悲剧为主线，以四大家族的荣辱兴衰为背景，描绘出18世纪中国封建社会的方方面面，以及封建专制下新兴资本主义民主思想的萌动。结构宏大、情节委婉、细节精致，人物形象栩栩如生，声口毕现，堪称中国古代小说中的经 典。")
//        };
//        List<Book> bookList = Arrays.asList(books);
//        model.addAttribute("bookList",bookList);
//        return "home";
//    }
//
//}
