import React from "react";
import ReactDOM from "react-dom";
import Button from "@material-ui/core/Button";
import { makeStyles } from "@material-ui/core/styles"; // styles 기능 추가

function App() {
  return (
    <Button variant="contained" color="primary">
      Hello World
    </Button>
  );
}

ReactDOM.render(<App />, document.querySelector("#app"));
