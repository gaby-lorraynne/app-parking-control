package com.api.parking_control.adapters.in.web.dto.responsebody;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataResponse<T> {
    private T data;
}
