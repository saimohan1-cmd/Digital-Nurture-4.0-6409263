import React, { useState } from 'react'

export default function CurrencyConvertor() {
    const [rupees,setRupees] = useState('');
    const [currency,setCurrency] = useState('euro');
    const exchangeRates = {euro: 0.0100,usd:0.011 };
    const handleChange = (e)=>{
        setRupees(e.target.value);
    }
    const handleCurrencyChange = (e)=>{
        setCurrency(e.target.value);
    }
    const handleSubmit = (e)=>{
        e.preventDefault();
        const rate = exchangeRates[currency];
        const result = parseFloat(rupees)*rate;
        const finalResult = result.toFixed(2);
        alert(`RS${rupees} = ${finalResult} ${currency.toUpperCase()}`)
    }
  return (
    <div>
      <h2 style={{color:'green'}}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <div>
        Amount:  
        <input type='number' value={rupees} onChange={handleChange} placeholder='Enter amount in RS'></input>
        </div>
    <div>
<select value={currency} onChange={handleCurrencyChange}>
        <option value="euro">Euro</option>
        <option value ="usd">USD</option>
      </select>
    </div>
      <div>
<button type='submit'>Convert</button>
      </div>
        
      </form>
    </div>
  )
}
