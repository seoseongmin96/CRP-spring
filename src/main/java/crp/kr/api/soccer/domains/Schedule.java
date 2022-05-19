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
    @Column(name = "schedule_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long scheduleNo;
    @Column(nullable = false) private String scheduleId;
    private String scheDate;
    private String gubun;
    private String homeTeamid;
    private String awayTeamid;
    private String homeScore;
    private String awayScore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_no")
    private Stadium stadium;
}
