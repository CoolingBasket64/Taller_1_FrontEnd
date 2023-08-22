import * as React from 'react'; 
import './App.css';
import Header  from './Header';
import Footer from './Footer';
import Aprendiz from './Aprendiz';

function App() {
  return (
    <div class="container-fluid">


      <Header />
      <br></br>
      <Aprendiz />
      <br></br>
      <Footer />
    
    </div>
  
  );
}
export default App;