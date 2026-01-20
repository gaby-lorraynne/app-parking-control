package com.api.parking_control.adapters.in.web.dto.requestbody;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpotDtoPost {
        @NotNull(message = "O campo parkingSpotNumber não pode estar vazia ou conter apenas espaços.")
        private String parkingSpotNumber;

        @NotNull(message = "O campo licensePlateCar não pode estar vazia ou conter apenas espaços.")
        @Size(max = 7)
        private String licensePlateCar;

        @NotNull(message = "O campo brandCar não pode estar vazia ou conter apenas espaços.")
        private String brandCar;

        @NotNull(message = "O campo modelCar não pode estar vazia ou conter apenas espaços.")
        private String modelCar;

        @NotNull(message = "O campo colorCar não pode estar vazia ou conter apenas espaços.")
        private String colorCar;

        @NotNull(message = "O campo responsibleName não pode estar vazia ou conter apenas espaços.")
        private String responsibleName;

        @NotNull(message = "O campo apartment não pode estar vazia ou conter apenas espaços.")
        private String apartment;

        @NotNull(message = "O campo block não pode estar vazia ou conter apenas espaços.")
        private String block;
}
