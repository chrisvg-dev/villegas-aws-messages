package villegas.aws.messages.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import villegas.aws.messages.backend.dto.CustomRequest;
import villegas.aws.messages.backend.dto.CustomResponse;
import villegas.aws.messages.backend.service.AwsMessageService;
import villegas.aws.messages.backend.service.AwsMessageServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/messages")
public class MessagesController {
    private AwsMessageService awsMessageService;

    public MessagesController(AwsMessageService awsMessageService){
        this.awsMessageService = awsMessageService;
    }

    @PostMapping
    public ResponseEntity<?> index(@RequestBody CustomRequest request) {
        CustomResponse response = new CustomResponse();
        this.awsMessageService.sendMessage( request.getMessage() );
        return ResponseEntity.ok(response);
    }
}
