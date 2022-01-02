package ai.ecma.appticketserver.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.NamedQueries;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class ErrorData {
    private String message;
    private Integer code; // 400
}
