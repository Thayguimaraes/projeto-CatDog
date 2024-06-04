import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastroPageComponent } from './cadastro-page.component';

describe('CadastroPageComponent', () => {
  let component: CadastroPageComponent;
  let fixture: ComponentFixture<CadastroPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CadastroPageComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CadastroPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
