import { useState } from "react";

export  const IncDec=()=>{
    const[count,setCount]=useState(0);
    const handleIncrement=()=>{
        setCount(count+parseInt(1));
    }
    const handleDecrement=()=>{
        setCount(count-1);
    } 
    const handleReset=()=>{
        setCount(0);
    }
return<>
<button onClick={handleIncrement} disabled={count>=100}>Increment</button>
<button onClick={handleDecrement} disabled={count<=0}>Decrement</button>
<button onClick={handleReset}>Reset</button>
<p>{count}</p>
</>
}