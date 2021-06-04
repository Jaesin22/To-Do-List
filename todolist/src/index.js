import React from "react";
import ReactDOM from "react-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import { Button, Nav, Navbar, NavDropdown, Form, FormControl } from 'react-bootstrap';

function App() {
  return (
    <Button variant="primary">
      Hello World
    </Button>
  );
}

function CardHeader() {
  return (
    <Navbar bg="light" expand="lg">
      <Navbar.Brand href="#home">React-Bootstrap</Navbar.Brand>
      <Navbar.Toggle aria-controls="basic-navbar-nav" />
      <Navbar.Collapse id="basic-navbar-nav">
        <Nav className="mr-auto">
        </Nav>
        <Form inline>
          <FormControl type="text" placeholder="Search" className="mr-auto" />
          <Button variant="outline-success">Search</Button>
        </Form>
      </Navbar.Collapse>
    </Navbar>
  );

}

ReactDOM.render(<App />, document.querySelector("#app"));
ReactDOM.render(<CardHeader />, document.querySelector("#cardheader"));
