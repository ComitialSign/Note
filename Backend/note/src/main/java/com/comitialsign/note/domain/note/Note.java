package com.comitialsign.note.domain.note;

import com.comitialsign.note.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "notes")
@Table(name = "notes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;
}
