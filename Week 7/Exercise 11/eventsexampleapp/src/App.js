import './App.css';
import { useState } from 'react';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  const [counter,setCounter] = useState(0);
  const increment = ()=>{
    if(counter>=0){

      setCounter(counter+1);
    }
  }
  const sayHello=()=>{
    alert("Hello! Member!");
  }
  const handleIncrement = ()=>{
    increment();
    sayHello();
  }
  const decrement = ()=>{
    if(counter>0){
      setCounter(counter-1);
    }
  }
  const sayWelcome = (msg)=>{
    alert(msg);
  }
  const handleClick =()=>{
    alert("I was clicked");
  }
  return (
    <>
    <div>
      <h2>Counter : {counter}</h2>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <button onClick={()=>sayWelcome("Welcome")}>Say Welcome</button>
      <button onClick={handleClick}>Click on me</button>
    </div>
    <div>
      <CurrencyConvertor></CurrencyConvertor>
    </div>
    </>
    
  );
}
export default App;
