import { Component, OnInit } from '@angular/core';
import { MobileService } from './mobile.service';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  title = 'crud';

  constructor(private ms: MobileService) {}

  mobiles: any;

  // url = 'http://localhost:3004/mobiles';
  // fetchMobile() {
  //   return this.http.get<any>(this.url);
  // }

  ngOnInit(): void {
    this.getMobiles();
  }

  getMobiles() {
    this.ms.fetchMobile().subscribe(
      (data) => {
        this.mobiles = data;
      },
      (error) => {
        console.log('Error', error);
      }
    );
  }

  deleteMobile(id: any) {
    this.ms.deleteMobile(id).subscribe((res) => {
      this.getMobiles();
    });
  }
}
