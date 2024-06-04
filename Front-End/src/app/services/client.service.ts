import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Cliente } from '../model/client';
import { Observable, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  apiURL = 'http://localhost:8080';

  constructor(private http : HttpClient) { }

  getClients() : Observable<Array<Cliente>>{
    return this.http.get<Array<Cliente>>(`${this.apiURL}/Cliente`)
      .pipe(tap(x => console.log(x)));
  }

  createOrUpdateClients(Cliente: Cliente): void{
    this.http.post(`${this.apiURL}/Cliente`, Cliente)
      .subscribe(x => console.log(x));
  }

  deleteClient(id: number): void {
    this.http.get(`${this.apiURL}/Cliente/${id}`)
      .subscribe(x => console.log(x));
  }
}
