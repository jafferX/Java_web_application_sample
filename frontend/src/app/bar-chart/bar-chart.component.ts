import { Component, OnInit } from '@angular/core';
import { MovieService } from '../shared/movie/movie.service';

@Component({
  selector: 'app-bar-chart',
  templateUrl: './bar-chart.component.html',
  styleUrls: ['./bar-chart.component.css']
})
export class BarChartComponent implements OnInit {
    chartScan:Array<any>;
    constructor(private movieService: MovieService) { }

    ngOnInit() {
      this.movieService.getStars().subscribe(data => {
        this.chartScan = data;
      });

    }

    public barChartOptions:any = {
      scaleShowVerticalLines: false,
      responsive: true
    };
    public barChartLabels:string[] =['1', '2', '3', '4', '5'];
    public barChartType:string = 'bar';
    public barChartLegend:boolean = true;


    public barChartData:any [] = [{data:[0,0,1,1,1], label: 'movies'}];



// events
 public chartClicked(e:any):void {
   console.log(e);
 }

 public chartHovered(e:any):void {
   console.log(e);
 }
}
