package pro.sky.java.course2.profjd5_0envhw1112.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestExeption extends RuntimeException {
}
