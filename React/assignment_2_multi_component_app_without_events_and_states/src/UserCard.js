import './UserCard.css';

// basic info like :- name, headline, profile pic

import UserDetails from "./UserDetails";

function UserCard({name, headline, profilePicUrl, workEx, location, contactInfo, socialMediaLinks}) {

    return (

        <div className="userCard">
            <h2>{name}</h2>
            <img className="userImage"
                src={profilePicUrl}
                alt={`${name}'s-profile-pic`}
            />
            <h4><em>{headline}</em></h4>
            <UserDetails
                workEx={workEx}
                location={location}
                contactInfo={contactInfo}
                socialMediaLinks={socialMediaLinks}
            />
        </div>
    );
}

export default UserCard;