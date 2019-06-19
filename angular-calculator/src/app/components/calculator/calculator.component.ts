import { CalculatorService } from './../../services/calculator.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  firstNumber:number;
  secondNumber:number;

  constructor(private calculatorService:CalculatorService) { }

  ngOnInit() {
  }

  addToDatabase() {
    console.log("inside calculator.comp/add()");
    this.calculatorService.addtoDatabase(this.firstNumber, this.secondNumber);
  }

  getFromDatabase(id:number) {
    console.log("inside calculator.comp/getfrom");
    this.calculatorService.getFromDatabase(id);
  }

}
