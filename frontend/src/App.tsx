import { useEffect, useState } from 'react';
import axios from 'axios';

export default function App() {
  const [temp, setTemp] = useState('');

  useEffect(() => {
    axios.get('/api/init/')
      .then(res => res.data)
      .then(data => setTemp(data.data))
      .catch(err => console.error(err));
  }, []);

  return (
    <>
      <div>
        {temp}
      </div>
    </>
  );
}