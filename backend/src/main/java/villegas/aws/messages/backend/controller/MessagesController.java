package villegas.aws.messages.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import villegas.aws.messages.backend.dto.CustomRequest;
import villegas.aws.messages.backend.dto.CustomResponse;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/messages")
public class MessagesController {
    @PostMapping
    public ResponseEntity<?> index(@RequestBody CustomRequest request) {
        System.err.println(request);
        CustomResponse response = new CustomResponse();
        response.setMessage( request.getMessage() );
        return ResponseEntity.ok(response);
    }
}
