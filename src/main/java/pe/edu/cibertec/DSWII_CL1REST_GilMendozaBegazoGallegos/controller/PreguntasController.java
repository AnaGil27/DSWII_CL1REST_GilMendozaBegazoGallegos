package pe.edu.cibertec.DSWII_CL1REST_GilMendozaBegazoGallegos.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_CL1REST_GilMendozaBegazoGallegos.Service.PreguntaService;
import pe.edu.cibertec.DSWII_CL1REST_GilMendozaBegazoGallegos.model.MensajeResponse;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/preguntas")
public class PreguntasController {
    private PreguntaService preguntaService;

    @GetMapping("/salariosemanal")
    public ResponseEntity<MensajeResponse> calcularSalarioSemanal(@RequestParam Integer horasTrabajadas) {
        return new ResponseEntity<>(
                preguntaService.calcularSalarioSemanal(horasTrabajadas), HttpStatus.OK);
    }

    @GetMapping("/promediopracticas")
    public ResponseEntity<MensajeResponse> calcularPromedioPracticas(@RequestParam Integer nota1,
                                                                     @RequestParam Integer nota2,
                                                                     @RequestParam Integer nota3,
                                                                     @RequestParam Integer nota4) {
        return new ResponseEntity<>(
                preguntaService.calcularPromedioPracticas(nota1, nota2, nota3, nota4), HttpStatus.OK);
    }

    @GetMapping("/minutos")
    public ResponseEntity<MensajeResponse> calcularMinutos(@RequestParam Integer tiempoSegundos) {
        return new ResponseEntity<>(
                preguntaService.calcularMinutos(tiempoSegundos), HttpStatus.OK);
    }

    @GetMapping("/sumaserie")
    public ResponseEntity<MensajeResponse> calcularSumaSerie(@RequestParam Integer numeroLimite) {
        return new ResponseEntity<>(
                preguntaService.calcularSumaSerie(numeroLimite), HttpStatus.OK);
    }

    @GetMapping("/cuadradoymitad")
    public ResponseEntity<MensajeResponse> calcularCuadradoYMitad() {
        return new ResponseEntity<>(
                preguntaService.calcularCuadradoYMitad(), HttpStatus.OK);
    }
}