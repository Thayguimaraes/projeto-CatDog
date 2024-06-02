import { Routes } from '@angular/router';
import { ClientsPageComponent } from './clients-page/clients-page.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';

export const routes: Routes = [
  { path: 'Welcome', component: WelcomePageComponent },
  { path: 'Clients', component: ClientsPageComponent },
  { path: '',   redirectTo: '/Welcome', pathMatch: 'full' },
  { path: '**',   redirectTo: '/Welcome', pathMatch: 'full' },
];
