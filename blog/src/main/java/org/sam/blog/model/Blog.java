package org.sam.blog.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@ToString
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;

    private String url;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Comment> comments;

}
