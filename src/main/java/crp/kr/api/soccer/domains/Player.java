package crp.kr.api.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Component
@Entity
@Table(name="players")
public class Player {
}
