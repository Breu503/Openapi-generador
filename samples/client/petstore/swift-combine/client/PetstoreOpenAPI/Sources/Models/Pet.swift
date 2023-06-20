//
// Pet.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// A pet for sale in the pet store 
public struct Pet: Codable {
    public enum Status: String, Codable, CaseIterable {
        case available = "available"
        case pending = "pending"
        case sold = "sold"
    }
    public var id: Int64?
    public var category: Category?
    public var name: String
    public var photoUrls: [String]
    public var tags: [Tag]?
    /// pet status in the store
    public var status: Status?

    public init(id: Int64? = nil, category: Category? = nil, name: String, photoUrls: [String], tags: [Tag]? = nil, status: Status? = nil) {
        self.id = id
        self.category = category
        self.name = name
        self.photoUrls = photoUrls
        self.tags = tags
        self.status = status
    }
}
