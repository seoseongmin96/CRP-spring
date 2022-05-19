package crp.kr.api.soccer.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "teams")
public class Team {
    @Id
    @Column(name = "team_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private String teamNo;
    @Column(nullable = false) private String stadiumId;
    @Column(nullable = false) private String teamId;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String orig;
    private String zipcode1;
    private String zipcode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homepage;
    private String teamOwner;

    @OneToMany(mappedBy = "team")
    List<Player> players = new ArrayList<>();

}
