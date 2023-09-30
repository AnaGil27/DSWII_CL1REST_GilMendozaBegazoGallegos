package pe.edu.cibertec.DSWII_CL1REST_GilMendozaBegazoGallegos.Service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1REST_GilMendozaBegazoGallegos.model.MensajeResponse;

@Service
public class PreguntaService {
    public MensajeResponse calcularSalarioSemanal(Integer horasTrabajadas) {
        int salarioSemanal;

        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * 16;
        } else {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - horasNormales;
            salarioSemanal = (horasNormales * 16) + (horasExtras * 20);
        }
        return MensajeResponse.builder()
                .resultado("El salario semanal es: $" + salarioSemanal)
                .build();
    }

    public MensajeResponse calcularPromedioPracticas(int nota1, int nota2, int nota3, int nota4) {
        int notaEliminada = Math.min(Math.min(nota1, nota2), Math.min(nota3, nota4));
        int promedio = (nota1 + nota2 + nota3 + nota4 - notaEliminada) / 3;
        return MensajeResponse.builder()
                .resultado("La nota eliminada es: " + notaEliminada + ", y el promedio de prácticas es: " + promedio)
                .build();
    }

    public MensajeResponse calcularMinutos(int tiempoSegundos) {
        int minutos = tiempoSegundos / 60;
        return MensajeResponse.builder()
                .resultado("El tiempo en minutos es: " + minutos + " minutos")
                .build();
    }

    public MensajeResponse calcularSumaSerie(int numeroLimite) {
        int suma = 0;
        for (int i = 1; i <= numeroLimite; i++) {
            suma += i;
        }
        return MensajeResponse.builder()
                .resultado("La suma de los números de la serie hasta " + numeroLimite + " es: " + suma)
                .build();
    }

    public MensajeResponse calcularCuadradoYMitad() {
        StringBuilder resultado = new StringBuilder("Cuadrados y mitades de los números del 15 al 70:\n");
        for (int i = 15; i <= 70; i++) {
            int cuadrado = i * i;
            double mitad = (double) i / 2;

            resultado.append("Número: ").append(i).append(", Cuadrado: ").append(cuadrado).append(", Mitad: ").append(mitad).append("\n");
        }

        return MensajeResponse.builder()
                .resultado(resultado.toString())
                .build();
    }
}
