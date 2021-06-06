import React from "react";
import ReactDOM from "react-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import { Button, Nav, Navbar, FormControl } from 'react-bootstrap';
import {Container, Row, Col, Form } from "react-bootstrap";
import { withRouter } from "react-router";
import Sidebar from '../src/components/sidebar.js';
import { BrowserRouter } from 'react-router-dom';
import './Dashboard.css';

function CardHeader() {
  return (
    <Navbar bg="primary" expand="lg">
      <Navbar.Brand href="#home"></Navbar.Brand>
      <Navbar.Toggle aria-controls="basic-navbar-nav" />
      <Navbar.Collapse id="basic-navbar-nav">
        <Nav className="mr-auto">
        </Nav>
        <Form inline>
          <FormControl type="text" placeholder="Search" className="mr-auto" />
          <Button variant="danger">Search</Button>
        </Form>
      </Navbar.Collapse>
    </Navbar>
  );

}

const Dash = props => {
  return (
      <>
       <Container fluid>
              <Row>
                  <Col xs={2} id="sidebar-wrapper">      
                    <Sidebar />
                  </Col>
                  <Col  xs={10} id="page-content-wrapper">
                      this is a test
                  </Col> 
              </Row>

          </Container>
      </>
      );
};
const Dashboard = withRouter(Dash);
export default Dashboard

// ReactDOM.render(<App />, document.querySelector("#app"));
ReactDOM.render(<CardHeader />, document.querySelector("#cardheader"));
// ReactDOM.render(
//     <Sidebar />
//   , document.querySelector("#sidemenu"));
