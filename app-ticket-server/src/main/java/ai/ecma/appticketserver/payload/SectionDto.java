package ai.ecma.appticketserver.payload;

import ai.ecma.appticketserver.enums.SeatStatusEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class SectionDto {
    private Double price;
    private SeatStatusEnum status;;
    private List<RowDto> rowDtoList;
}
