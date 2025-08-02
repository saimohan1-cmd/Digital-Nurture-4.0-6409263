import './App.css';
import { useState } from 'react';
import Greeting from './components/Greeting';

function App() {
  const [isLoggenIn,setIsLoggedIn] = useState(false);
  const handleLogin=()=>{
    setIsLoggedIn(true);
  }
  const handleLogout=()=>{
    setIsLoggedIn(false)
  }
  return (
    <div>
      <h1>Ticket booking app</h1>
      {isLoggenIn?(
        <button onClick={handleLogout}>Logout</button>
      ): (<button onClick = {handleLogin}>Login</button>)}
      <Greeting isLoggedIn={isLoggenIn}></Greeting>
    </div>  
  );
}

export default App;
