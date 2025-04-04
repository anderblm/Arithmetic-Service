package edu.iu.p466.arithmetic_service.controller;

import edu.iu.p466.arithmetic_service.service.IArithmeticService;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/add")
public class ArithmeticController {

    IArithmeticService arithmeticService;

    public ArithmeticController(IArithmeticService arithmeticService)
    {
        this.arithmeticService = arithmeticService;
    }

    @GetMapping("/{n}/{m}")
    public int add(@PathVariable int n, @PathVariable int m){
        return arithmeticService.add(n,m);
    }

}
