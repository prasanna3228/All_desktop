import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CounterdisplyComponent } from './counterdisply.component';

describe('CounterdisplyComponent', () => {
  let component: CounterdisplyComponent;
  let fixture: ComponentFixture<CounterdisplyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CounterdisplyComponent]
    });
    fixture = TestBed.createComponent(CounterdisplyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
