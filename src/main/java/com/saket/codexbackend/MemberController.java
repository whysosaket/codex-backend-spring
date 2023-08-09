package com.saket.codexbackend;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public ResponseEntity<List<Member>> getMembers(){
        return new ResponseEntity<List<Member>>(memberService.getMembers(), HttpStatus.OK);
    }
}
