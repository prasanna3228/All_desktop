import { Component, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';

@Component({
  selector: 'app-counterdisply',
  templateUrl: './counterdisply.component.html',
  styleUrls: ['./counterdisply.component.css'],
})
export class CounterdisplyComponent implements OnInit {
  constructor(private store: Store<{ counter: { counter: number } }>) {}

  counterdisply!: number;
  ngOnInit(): void {
    this.store.select('counter').subscribe((data) => {
      this.counterdisply = data.counter;
    });
  }
}
