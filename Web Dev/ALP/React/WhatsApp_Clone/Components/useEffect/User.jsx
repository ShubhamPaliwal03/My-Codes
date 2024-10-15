import { useState, useEffect } from "react";

function User () {

    const [isLoading, setIsLoading] = useState(true);
    const [userData, setUserData] = useState(null);

    function loadUser() {

        (async () => {
    
            const jsonData = await fetch("https://jsonplaceholder.typicode.com/users/1");
            const userData = await jsonData.json();
            
            setIsLoading(false);
            setUserData(userData);
    
        })();
    }

    useEffect(loadUser, []);

    if (isLoading) {

        return(
            <>
                <h3>Welcome</h3>
                <div>Loading...</div>
            </>
        );
    }
    

    return (
        <>
            <h3>Welcome</h3>
            <div>{userData.username}</div>
            <div>{userData.address.street}</div>
            <div>{userData.phone}</div>
            <div>{userData.website}</div>
        </>
    );
}

export default User;