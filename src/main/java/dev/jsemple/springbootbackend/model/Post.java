package dev.jsemple.springbootbackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Entity class for a Post
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Table
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String identifier;

    @NotNull
    @Column
    private String title;

    @NotNull
    @Column
    private String body;

    @NotNull
    @Column
    private String summary;

    @NotNull
    private Boolean visible;

    @NotNull
    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;
}