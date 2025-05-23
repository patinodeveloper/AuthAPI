package auth_api.entities.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModuleRequestDTO {
    @NotBlank(message = "El nombre del módulo es obligatorio")
    @Size(min = 3, max = 50, message = "El nombre del módulo debe tener entre 3 y 50 caracteres")
    private String name;

    private String description;
}
