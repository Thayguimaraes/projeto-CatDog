import { Routes } from '@angular/router';
import { ClientsPageComponent } from './clients-page/clients-page.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';
import { ServicesPageComponent } from './services-page/services-page.component';
import { CadastroPageComponent } from './cadastro-page/cadastro-page.component';

export const routes: Routes = [
  { path: 'Welcome', component: WelcomePageComponent },
  { path: 'Clients', component: ClientsPageComponent },
  { path: 'Services', component: ServicesPageComponent},
  { path: 'Cadastro', component: CadastroPageComponent},
  { path: '',   redirectTo: '/Welcome', pathMatch: 'full' },
  { path: '**',   redirectTo: '/Welcome', pathMatch: 'full' },
];
