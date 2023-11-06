import { Component, OnInit } from '@angular/core';
import { ChartSeries, PieChartConfiguration } from 'ontimize-web-ngx-charts';


@Component({
  selector: 'app-goals-home',
  templateUrl: './goals-home.component.html',
  styleUrls: ['./goals-home.component.css']
})
export class GoalsHomeComponent implements OnInit {

  chartParameters: PieChartConfiguration;

  constructor() {
  
    this.chartParameters = new PieChartConfiguration();

    this.chartParameters.labelType="percent";
    this.chartParameters.margin.top=30;
    this.chartParameters.legendPosition='right';
    this.chartParameters.legend.margin.right=20;
  }

  ngOnInit() {
  }

}