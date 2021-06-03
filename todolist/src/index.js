import React from "react";
import ReactDOM from "react-dom";
import Button from "@material-ui/core/Button";
import CardHeader from '@material-ui/core/CardHeader';
import CardMedia from '@material-ui/core/CardMedia';

function App() {
  return (
    <Button variant="contained" color="primary">
      Hello World
    </Button>
  );
}

function CardHead() {
  return (
    <CardHeader>
      1234
    </CardHeader>
  );

}

ReactDOM.render(<App />, document.querySelector("#app"));
ReactDOM.render(<CardHead />, document.querySelector("#cardheader"));
