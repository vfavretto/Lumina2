import { TestBed } from '@angular/core/testing';

import { VerificaCredenciaisService } from './verifica-credenciais.service';

describe('VerificaCredenciaisService', () => {
  let service: VerificaCredenciaisService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(VerificaCredenciaisService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
