package crp.kr.api.soccer.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "stadiums")
public class Stadium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
    private String stadiumid;
    private String stadiumName;
    private String homeTeamid;
    private String seatCount;
    private String address;
    private String ddd;
    private String tel;
}
