package ai.ecma.appticketserver.payload;

import ai.ecma.appticketserver.enums.SeatStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatChairDto {
    @NotNull
    private SeatStatusEnum seatStatusEnum;
    @NotBlank
    private String nameSeat;
    @NotNull
    private double price;
    @NotNull
    private int row;
    @NotBlank
    private String section;
}
