import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  constructor(private httpClient:HttpClient) { }

  url = "http://localhost:8080/api/calculator";

  addtoDatabase(firstNumber:number, secondNumber:number) {
    console.log("inside calculator.serv/add()");

    const calculator:JSON = <JSON><unknown>{
      "firstNumber": firstNumber,
      "secondNumber": secondNumber
    }

    return this.httpClient.post(this.url, calculator).subscribe();
  }

  getFromDatabase(id:number) {
    console.log("inside calculator.serv/add()");
    return this.httpClient.get(this.url + "/add/" + id).subscribe();
  }

}
