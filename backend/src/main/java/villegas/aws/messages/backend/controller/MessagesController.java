package villegas.aws.messages.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import villegas.aws.messages.backend.dto.CustomResponse;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/messages")
public class MessagesController {
    @GetMapping
    public ResponseEntity<?> index() {
        CustomResponse response = new CustomResponse();
        response.setMessage("Works");
        return ResponseEntity.ok(response);
    }
}
