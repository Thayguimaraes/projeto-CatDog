import { Component } from '@angular/core';
import { CardComponent } from '../card/card.component';
import { ClientService } from '../services/client.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-clients-page',
  standalone: true,
  imports: [CardComponent, CommonModule],
  templateUrl: './clients-page.component.html',
  styleUrl: './clients-page.component.css'
})
export class ClientsPageComponent {
  constructor(private clientService: ClientService){}

  $AllClients = this.clientService.getClients();
}
