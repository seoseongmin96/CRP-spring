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
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
    private String stadiumid;
    private String scheDate;
    private String gubun;
    private String homeTeamid;
    private String awayTeamid;
    private String homeScore;
    private String awayScore;
}
