import { useState } from 'react';
import './App.css';

const Aprendiz =  () => {

    const [aprendiz, setAprendiz] = useState([{
        id: 1,
        fullName: "Santiago Carreño",
        designation: "Aprendiz",
        gender: "male",
        ficha: "2687351"
    },
    { 
        id: 2,
        fullName: "Julian Torres",
        designation: "Aprendiz",
        gender: "male",
        ficha: "2687351"
    },
    { 
        id: 3,
        fullName: "Andres Galindo",
        designation: "Aprendiz",
        gender: "male",
        ficha: "2687351"
    },
    { 
        id: 4,
        fullName: "Edwin Ospina",
        designation: "Aprendiz",
        gender: "male",
        ficha: "2687351"
    },
    { 
        id: 5,
        fullName: "Laura Oviedo",
        designation: "Aprendiz",
        gender: "female",
        ficha: "2687351"
    },
    { 
        id: 6,
        fullName: "Mariana Ovando",
        designation: "Aprendiz",
        gender: "female",
        ficha: "2687351"
    },
    { 
        id: 7,
        fullName: "John Martinez",
        designation: "Aprendiz",
        gender: "male",
        ficha: "2687351"
 
    
    }]);

    return (
        <main>
            <table>
                <thead>
                    <tr>
                        <td><h3>Nombres</h3></td>
                        <td><h3>Rol</h3></td>
                        <td><h3>Genero</h3></td>
                        <td><h3>Ficha</h3></td>
                    </tr>
                </thead>
            </table>
            
            {
                aprendiz.map((employee) => (
                    <table>
   
                        <tbody>
                            <tr>
                                <th><p>{employee.fullName}</p></th>
                                <th><p>{employee.designation}</p></th>
                                <th><p>{employee.gender}</p></th>
                                <th><p>{employee.ficha}</p></th>
                            </tr>
                    
                        </tbody>
                    </table>
                ))
            }
        </main>
        
    ) 
    
}

export default Aprendiz